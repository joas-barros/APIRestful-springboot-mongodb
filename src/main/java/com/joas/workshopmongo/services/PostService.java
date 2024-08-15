package com.joas.workshopmongo.services;

import com.joas.workshopmongo.domain.Post;
import com.joas.workshopmongo.domain.User;
import com.joas.workshopmongo.dto.UserDTO;
import com.joas.workshopmongo.repository.PostRepository;
import com.joas.workshopmongo.repository.UserRepository;
import com.joas.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

}
