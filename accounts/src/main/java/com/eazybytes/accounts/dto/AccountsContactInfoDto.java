package com.eazybytes.accounts.dto;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "accounts")
@Getter
@Setter
public class AccountsContactInfoDto {

	private String message;
	private Map<String, String> contactDetails;
	private List<String> onCallSupport;

}

/**
 * With record we cannot update the config properties during runtime by invoking the setter methods
 */

//package com.eazybytes.accounts.dto;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//
//@ConfigurationProperties(prefix = "accounts")
//public record AccountsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
//
//}
