package com.after00.im.client.console;

import com.after00.im.protocol.request.LogoutRequestPacket;
import io.netty.channel.Channel;

import java.util.Scanner;

public class LogoutConsoleCommand implements ConsoleCommand {
    @Override
    public void exec(Scanner scanner, Channel channel) {
        LogoutRequestPacket logoutRequestPacket = new LogoutRequestPacket();
        channel.writeAndFlush(logoutRequestPacket);
    }
}
