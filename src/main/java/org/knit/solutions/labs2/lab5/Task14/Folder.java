package org.knit.solutions.labs2.lab5.Task14;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemElement {
    private String name;
    private List<FileSystemElement> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(FileSystemElement element) {
        children.add(element);
    }

    public List<FileSystemElement> getChildren() {
        return children;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);

        for (FileSystemElement child : children) {
            child.accept(visitor);
        }
    }
}
