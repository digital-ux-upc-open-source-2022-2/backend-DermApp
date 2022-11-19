package com.DermApp.Backend.diagnostic.api.rest;

import com.DermApp.Backend.diagnostic.domain.service.FileService;
import com.DermApp.Backend.diagnostic.mapping.FileMapper;
import com.DermApp.Backend.diagnostic.resource.CreateFileResource;
import com.DermApp.Backend.diagnostic.resource.FileResource;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/files", produces = "application/json")
@Tag(name = "Files", description = "Create, read and update")
public class FilesController {

    public final FileService fileService;
    private final FileMapper mapper;


    public FilesController(FileService fileService, FileMapper mapper) {
        this.fileService = fileService;
        this.mapper = mapper;
    }

    @GetMapping("{fileId}")
    public FileResource getFileById(@PathVariable Long fileId){
        return mapper.toResource(fileService.getById(fileId));
    }

    @PostMapping
    public ResponseEntity<FileResource> createFile(@RequestBody CreateFileResource resource){
        return new ResponseEntity<>(mapper.toResource(fileService.create(mapper.toModel(resource))), HttpStatus.CREATED);
    }

    @DeleteMapping("{fileId}")
    public ResponseEntity<?> deleteFile(@PathVariable Long fileId){
        return fileService.delete(fileId);
    }
}
