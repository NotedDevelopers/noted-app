package com.noted.auth;

public interface UserRepository {
  User findByToken(String token);
}
