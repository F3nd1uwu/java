package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.labs2.lab5.Task14.*;

@TaskDescription(taskNumber = 14, taskDescription = "2.14 Задача Паттерн Визитер (Visitor)")
public class Task2_14 implements Solution {
    @Override
    public void execute() {
        // Создаем структуру файловой системы
        Folder root = new Folder("Root");

        File file1 = new File("Document.txt", 100, false);
        File file2 = new File("Image.jpg", 200, true);
        File file3 = new File("Report.pdf", 300, false);

        Folder subFolder = new Folder("Subfolder");
        File file4 = new File("Data.csv", 150, true);
        subFolder.add(file4);

        Link link = new Link("Shortcut", file3);

        root.add(file1);
        root.add(file2);
        root.add(subFolder);
        root.add(file3);
        root.add(link);

        // Сканируем на вирусы
        VirusScanner virusScanner = new VirusScanner();
        root.accept(virusScanner);

        if (!virusScanner.isVirusFound()) {
            System.out.println("Вирусы не обнаружены");
        }

        // Анализируем размер
        SizeAnalyzer sizeAnalyzer = new SizeAnalyzer();
        root.accept(sizeAnalyzer);
        System.out.println("Общий размер файлов: " + sizeAnalyzer.getTotalSize() + " KB");
    }
}
