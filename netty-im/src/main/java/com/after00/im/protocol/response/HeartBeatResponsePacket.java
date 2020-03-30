package com.after00.im.protocol.response;


import com.after00.im.protocol.Packet;

import static com.after00.im.protocol.command.Command.HEARTBEAT_RESPONSE;

public class HeartBeatResponsePacket extends Packet {
    @Override
    public Byte getCommand() {
        return HEARTBEAT_RESPONSE;
    }
}
