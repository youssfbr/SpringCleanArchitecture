package com.github.youssfbr.cleanarch.repositories;

import com.github.youssfbr.cleanarch.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
