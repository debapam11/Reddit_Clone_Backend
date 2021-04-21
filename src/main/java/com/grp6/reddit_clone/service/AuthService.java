package com.grp6.reddit_clone.service;

import java.time.Instant;
import java.util.UUID;

import javax.transaction.Transactional;
import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties.Identityprovider.Verification;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.grp6.reddit_clone.dto.RegisterRequest;
import com.grp6.reddit_clone.model.User;
import com.grp6.reddit_clone.model.VerificationToken;
import com.grp6.reddit_clone.repository.UserRepository;
import com.grp6.reddit_clone.repository.VerificationTokenRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthService {
	

		private final PasswordEncoder passwordEncoder;

		private final UserRepository userRepository;
		
		private final VerificationTokenRepository verificationTokenRepository;
	
		@Transactional
		private void signup(RegisterRequest registerRequest) {
			// TODO Auto-generated method stub
			User user = new User();
			user.setUsername(registerRequest.getUsername());
			user.setEmail(registerRequest.getEmail());
			user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
			user.setCreated(Instant.now());
			user.setEnabled(false);
			
			
			userRepository.save(user);
			
			String token =  generateVerificationToken(user);
			
		}
			
			
			private String generateVerificationToken(User user){
				String token = UUID.randomUUID().toString();
				VerificationToken verificationToken = new VerificationToken();
				verificationToken.setToken(token);
				verificationToken.setUser(user);
				
				verificationTokenRepository.save(verificationToken);
				return token;
			}
	}

