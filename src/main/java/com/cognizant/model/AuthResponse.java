package com.cognizant.model;

import lombok.Data;

/**
 *
 * 
 * 		model class for authorization response
 * 
 *      @Data is a convenient shortcut annotation that bundles 
 *      the features of @ToString , @EqualsAndHashCode , @Getter / @Setter 
 *      and @RequiredArgsConstructor together
 *
 */
@Data
public class AuthResponse {
	
	private String uid;
	private String name;
	private boolean isValid;
}
