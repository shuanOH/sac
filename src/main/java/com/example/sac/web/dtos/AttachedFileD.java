package com.example.sac.web.dtos;

import com.example.sac.domain.entities.AttachedFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttachedFileD {
    private long fno;
    private String fileName;
    private String filePath;
    private String fileContentType;
    private NoticeD notice;

    public AttachedFile toEntity() {
        return AttachedFile.builder()
                .fno(this.getFno())
                .fileName(this.getFileName())
                .filePath(this.getFilePath())
                .fileContentType(this.getFileContentType())
                .notice(this.getNotice().toEntity())
                .build();
    }
}
