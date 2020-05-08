package com.mistborn.trackend.domain.service

import com.mistborn.trackend.domain.TrackedHashTag
import com.mistborn.trackend.domain.repository.TrackedHashTagRepository
import org.springframework.stereotype.Service

@Service
class TrackedHashTagService(private val repository:TrackedHashTagRepository) {

    fun save(hashTag: TrackedHashTag) = this.repository.save(hashTag)

    fun all() = this.repository.findAll()

}