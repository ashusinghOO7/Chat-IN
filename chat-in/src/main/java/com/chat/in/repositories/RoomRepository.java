package com.chat.in.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.chat.in.entities.Room;

public interface RoomRepository extends MongoRepository<Room, String> {
    // get room using room id
    Room findByRoomId(String roomId);
}