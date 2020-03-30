package com.after00.im.protocol.request;


import com.after00.im.protocol.Packet;

import static com.after00.im.protocol.command.Command.HEARTBEAT_REQUEST;

public class HeartBeatRequestPacket extends Packet {
    @Override
    public Byte getCommand() {
        return HEARTBEAT_REQUEST;
    }
}
