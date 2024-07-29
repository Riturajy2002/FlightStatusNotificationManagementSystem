package com.fsnm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsnm.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
