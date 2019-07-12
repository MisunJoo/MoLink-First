package com.mashup.molinkfirst.folder;

import static javafx.scene.input.KeyCode.T;

import com.mashup.molinkfirst.user.User;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
  List<Folder> findByUser(User user);
  Folder findByParent(Folder folder);

  List<Folder> findByParentIsNull();

  List<Folder> findAllByParent(Optional<Folder> folder);
  List<Folder> findAllByUser(User user);
}
