package com.example.noteTaking.service;

import com.example.noteTaking.entity.Tag;
import com.example.noteTaking.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
    @Autowired
    private TagRepository tagRepository;

    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    public Tag createTag(Tag tag) {
        return tagRepository.save(tag);
    }

    public Tag updateTag(Long id, Tag tag) {
        Tag existingTag = tagRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Tag not found"));
        existingTag.setName(tag.getName());
        return tagRepository.save(existingTag);
    }

    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }
}
