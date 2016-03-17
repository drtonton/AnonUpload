package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by noellemachin on 3/16/16.
 */
@Entity
@Table(name = "files")
public class AnonFile {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String filename;

    @Column(nullable = false)
    String originalFilename;

    @Column(nullable = false)
    boolean perm;

    public AnonFile() {
    }

    public AnonFile(String filename, String originalFilename, boolean perm) {
        this.filename = filename;
        this.originalFilename = originalFilename;
        this.perm = perm;
    }

    public int getId() {
        return id;
    }
    public boolean getPerm() {
        return perm;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }
}
