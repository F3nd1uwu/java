package org.knit.solutions.labs2.lab5.Task14;

public class Link implements FileSystemElement {
    private String name;
    private FileSystemElement target;

    public Link(String name, FileSystemElement target) {
        this.name = name;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public FileSystemElement getTarget() {
        return target;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
