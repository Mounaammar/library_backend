package com.library.books.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    @Column(columnDefinition="TEXT")
    private String cover;

    @OneToOne
    private Author author;
    @Column(columnDefinition="TEXT")
    private String description;
}
