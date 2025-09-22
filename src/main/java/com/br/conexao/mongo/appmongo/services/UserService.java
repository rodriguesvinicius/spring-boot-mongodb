package com.br.conexao.mongo.appmongo.services;

import com.br.conexao.mongo.appmongo.models.User;
import com.br.conexao.mongo.appmongo.repositories.UserRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public User findById(String id) {
    return userRepository.findById(id).orElse(null);
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public User updateUser(User user) {
    if (user == null || user.getId() == null) {
      return null;
    }
    User existingUser = findById(user.getId());
    if (existingUser == null) {
      return null;
    }
    BeanUtils.copyProperties(user, existingUser);
    return userRepository.save(existingUser);
  }

  public void deleteUser(String id) {
    userRepository.deleteById(id);
  }
}
