package br.com.estruturais.composite.folders.model;

import static java.lang.System.*;

import java.util.List;

public class Folder implements FileSystemItem {
    private String name;
    private List<FileSystemItem> childs;

    public Folder(String name, List<FileSystemItem> childs) {
        this.name = name;
        this.childs = childs;
    }

    @Override
    public void print(String structure) {
        out.println(structure + name);
        for (FileSystemItem child : childs) {
            child.print(structure + "| ");
        }
    }

}
