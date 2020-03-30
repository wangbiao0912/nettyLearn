package com.after00.im.protocol.response;

import com.after00.im.protocol.Packet;
import lombok.Data;

import static com.after00.im.protocol.command.Command.MESSAGE_RESPONSE;

@Data
public class MessageResponsePacket extends Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}
