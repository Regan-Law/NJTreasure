package com.law.njtreasure.repository

import com.law.njtreasure.entity.EnterpriseUser
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EnterpriseUserRepository : JpaRepository<EnterpriseUser, Long>