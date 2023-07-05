package com.law.njtreasure.repository

import com.law.njtreasure.entity.Type
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TypeRepository : JpaRepository<Type, Long>