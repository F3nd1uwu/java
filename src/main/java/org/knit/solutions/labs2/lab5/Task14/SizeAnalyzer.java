package org.knit.solutions.labs2.lab5.Task14;

public class SizeAnalyzer implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Folder folder) {
        // Для папки ничего не добавляем, размер считается по файлам
    }

    @Override
    public void visit(Link link) {
        // Ссылки не учитываем, как требуется в задаче
    }

    public int getTotalSize() {
        return totalSize;
    }
}
