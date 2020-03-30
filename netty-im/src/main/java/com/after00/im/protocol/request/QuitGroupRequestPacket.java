package com.after00.im.protocol.request;

import com.after00.im.protocol.Packet;
import lombok.Data;

import static com.after00.im.protocol.command.Command.QUIT_GROUP_REQUEST;

@Data
public class QuitGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return QUIT_GROUP_REQUEST;
    }
}
