package com.example.data.model

import com.example.domain.model.WaitingRoomStatus


data class PlayerDto(
    val playerId: String,
    val nickname: String,
)

data class CreateWaitingRoomRequest(
    val user: PlayerDto
)

data class CreateWaitingRoomResponse(
    val waitingRoomId: String
)


data class WaitingRoomDto (
    val roomId: String,
    val hostId: String,
    val participantList: List<PlayerDto>,
    val waitingRoomStatus: WaitingRoomStatus,
)


data class WaitingRoomDataDto (
    val roomId: String,
    val hostId: String,
    val participantList: List<PlayerDto>,
    val waitingRoomStatus: WaitingRoomStatus,
)