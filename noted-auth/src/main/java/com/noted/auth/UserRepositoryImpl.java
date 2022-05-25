package com.noted.auth;

public class UserRepositoryImpl implements UserRepository {
  @Override
  public User findByToken(String token) {
    return token == null ? null : new User("user1");
  }
}
