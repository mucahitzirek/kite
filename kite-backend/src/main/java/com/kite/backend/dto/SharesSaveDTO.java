package com.kite.backend.dto;

import com.kite.backend.model.Shares;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SharesSaveDTO {

    private String header;

    private String content;

    private String comments;

    public SharesSaveDTO(Shares shares) {
        this.header = shares.getHeader();
        this.content = shares.getContent();
        this.comments = shares.getComments(); }


}
