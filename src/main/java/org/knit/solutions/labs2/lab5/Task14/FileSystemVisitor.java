package org.knit.solutions.labs2.lab5.Task14;

public interface FileSystemVisitor {
    void visit(File file);
    void visit(Folder folder);
    void visit(Link link);
}
