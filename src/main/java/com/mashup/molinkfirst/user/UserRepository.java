package com.mashup.molinkfirst.user;

import com.mashup.molinkfirst.folder.Folder;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User findByPhoneUuid(String uuid);
}
