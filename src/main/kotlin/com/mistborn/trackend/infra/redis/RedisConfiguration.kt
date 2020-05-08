package com.mistborn.trackend.infra.redis

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory
import org.springframework.data.redis.core.ReactiveRedisTemplate
import org.springframework.data.redis.serializer.RedisSerializationContext

@Configuration
open class RedisConfiguration {

    @Bean
    @Primary
    open fun reactiveRedisTemplate(connectionFactory: ReactiveRedisConnectionFactory):ReactiveRedisTemplate<String,String> {
        return ReactiveRedisTemplate(connectionFactory, RedisSerializationContext.string())
    }

}