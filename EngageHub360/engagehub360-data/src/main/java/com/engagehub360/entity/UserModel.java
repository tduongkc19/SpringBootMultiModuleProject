/**
 * 
 */
package com.engagehub360.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author tduon
 *
 */
@Data
@RequiredArgsConstructor
public class UserModel {
	
    Long id; 
    String name; 
    String email; 
    String pincode;
}
