package com.mashup.molinkfirst.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User createUser(String phoneUuid){
    User user = User.builder()
        .phoneUuid(phoneUuid)
        .build();

    userRepository.save(user);
    return user;
  }

  public User findUser(String phoneUuid){
    User user = userRepository.findByPhoneUuid(phoneUuid);
    return userRepository.getOne(user.getId());
  }
}
