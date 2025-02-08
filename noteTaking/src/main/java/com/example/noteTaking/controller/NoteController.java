package com.example.noteTaking.controller;

import com.example.noteTaking.entity.Notes;
import com.example.noteTaking.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping
    public List<Notes> getAllNotes() {
        return noteService.getAllNotes();
    }

    @PostMapping
    public Notes createNote(@RequestBody Notes note) {
        return noteService.createNotes(note);
    }

    @PutMapping("/{id}")
    public Notes updateNote(@PathVariable Long id, @RequestBody Notes note) {
        return noteService.updateNotes(id, note);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id) {
        noteService.deleteNotes(id);
    }
}
