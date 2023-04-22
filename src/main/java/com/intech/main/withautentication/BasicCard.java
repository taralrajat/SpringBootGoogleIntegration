package com.intech.main.withautentication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BasicCard {
	
	private String title;
    private String subtitle;
    private String formattedText;
    private Image image;
    private Button button;

}
