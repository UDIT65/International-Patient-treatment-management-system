package com.cognizant.auth.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
	
	/**
	 * instance variables
	 */
	private String uid;
	private String name;
	private boolean isValid;
}
