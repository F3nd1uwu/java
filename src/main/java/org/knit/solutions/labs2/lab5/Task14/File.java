package org.knit.solutions.labs2.lab5.Task14;

public class File implements FileSystemElement {
    private String name;
    private int size;
    private boolean hasVirus;

    public File(String name, int size, boolean hasVirus) {
        this.name = name;
        this.size = size;
        this.hasVirus = hasVirus;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean hasVirus() {
        return hasVirus;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
