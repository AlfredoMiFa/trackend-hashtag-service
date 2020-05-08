package com.mistborn.trackend.domain.resource

import com.mistborn.trackend.domain.TrackedHashTag
import com.mistborn.trackend.domain.service.TrackedHashTagService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/tracked-hash-tag")
class TrackedHashTagResource(private val service:TrackedHashTagService) {

    @GetMapping
    fun all() = this.service.all()

    @PostMapping("/add")
    fun save(@RequestBody hashTag: TrackedHashTag) = this.service.save(hashTag)

}