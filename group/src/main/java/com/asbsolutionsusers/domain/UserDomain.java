package com.asbsolutionsusers.domain;

import com.asbsolutionsusers.repo.CustomRepository;
import com.asbsolutionsusers.repo.UserRepository;
import com.asbsolutionsusers.users.User;

import javax.xml.transform.Transformer;

public class UserDomain extends BaseDomain<User, Long> {
    private final UserRepository userRepository;


    public UserDomain(CustomRepository<User, Long> repository, Transformer transformer,
                       UserRepository userRepository) {
        super(repository, transformer);




        this.userRepository = userRepository;

    }
}
