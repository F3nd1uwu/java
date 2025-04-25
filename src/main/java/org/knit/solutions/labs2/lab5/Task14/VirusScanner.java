package org.knit.solutions.labs2.lab5.Task14;

public class VirusScanner implements FileSystemVisitor {
    private boolean virusFound = false;

    @Override
    public void visit(File file) {
        if (file.hasVirus()) {
            System.out.println("Вирус обнаружен в файле: " + file.getName());
            virusFound = true;
        }
    }

    @Override
    public void visit(Folder folder) {
        // Для папки ничего не делаем, вирусы проверяются в файлах
    }

    @Override
    public void visit(Link link) {
        // Для ссылки ничего не делаем, вирусы проверяются в файлах
    }

    public boolean isVirusFound() {
        return virusFound;
    }
}
