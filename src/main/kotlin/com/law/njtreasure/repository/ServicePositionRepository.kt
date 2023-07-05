package com.law.njtreasure.repository

import com.law.njtreasure.entity.ServicePosition
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ServicePositionRepository : JpaRepository<ServicePosition, Long>