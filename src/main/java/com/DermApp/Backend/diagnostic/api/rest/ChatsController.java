package com.DermApp.Backend.diagnostic.api.rest;

import com.DermApp.Backend.diagnostic.domain.service.ChatService;
import com.DermApp.Backend.diagnostic.mapping.ChatMapper;
import com.DermApp.Backend.diagnostic.resource.ChatResource;
import com.DermApp.Backend.diagnostic.resource.CreateChatResource;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/chats", produces = "application/json")
@Tag(name = "Chats", description = "Create, read")
public class ChatsController {
    public final ChatService chatService;
    private final ChatMapper mapper;

    public ChatsController(ChatService chatService, ChatMapper mapper) {
        this.chatService = chatService;
        this.mapper = mapper;
    }

    @GetMapping("{chatId}")
    public ChatResource getChatById(@PathVariable Long chatId){
        return mapper.toResource(chatService.getById(chatId));
    }

    @PostMapping
    public ResponseEntity<ChatResource> createChat(@RequestBody CreateChatResource resource){
        return new ResponseEntity<>(mapper.toResource(chatService.create(mapper.toModel(resource))), HttpStatus.CREATED);
    }
}
