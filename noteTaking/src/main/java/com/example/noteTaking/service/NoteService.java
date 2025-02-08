package com.example.noteTaking.service;

import com.example.noteTaking.entity.Notes;
import com.example.noteTaking.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;

    public List<Notes> getAllNotes() {
        return noteRepository.findAll();
    }

    public Notes createNotes(Notes note) { // Changed method name to createNotes
        return noteRepository.save(note);
    }

    public Notes updateNotes(Long id, Notes note) { // Changed method name to updateNotes
        Notes existingNote = noteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Notes not found"));
        existingNote.setTitle(note.getTitle());
        existingNote.setContent(note.getContent());
        return noteRepository.save(existingNote);
    }

    public void deleteNotes(Long id) { // Changed method name to deleteNotes
        noteRepository.deleteById(id);
    }
}
