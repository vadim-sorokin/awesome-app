package com.andersen.aws.awesome.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersen.aws.awesome.entitiy.AwesomeEntity;

public interface AwesomeRepository extends JpaRepository<AwesomeEntity, Long> {

}
