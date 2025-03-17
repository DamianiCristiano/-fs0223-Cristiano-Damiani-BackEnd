package com.epicode.Spring.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MatchDto {
	private String date;
    private Long teamRId;
    private Long teamBId;
    private Integer dayOfGames;
}
