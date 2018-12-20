/*
 * Decompiled with CFR 0_132.
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

final class ax
implements Runnable {
    private /* synthetic */ GUI c;

    ax(GUI gUI) {
        this.c = gUI;
    }

    @Override
    public final void run() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        OutputStreamWriter outputStreamWriter = null;
        Object object = "13267";
        try {
            try {
                serverSocket = new ServerSocket(Integer.parseInt((String)object));
                do {
                    try {
                        try {
                            socket = serverSocket.accept();
                            object = socket.getInputStream();
                            object = new InputStreamReader((InputStream)object);
                            object = new BufferedReader((Reader)object);
                            String string = object.readLine();
                            string = GUI.a(this.c, string);
                            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
                            outputStreamWriter.write(string, 0, string.length());
                            outputStreamWriter.flush();
                            object.close();
                        }
                        catch (Throwable throwable) {
                            try {
                                if (socket != null) {
                                    socket.close();
                                }
                                if (outputStreamWriter == null) continue;
                                outputStreamWriter.close();
                            }
                            catch (Throwable throwable2) {}
                            continue;
                        }
                    }
                    catch (Throwable throwable) {
                        try {
                            if (socket != null) {
                                socket.close();
                            }
                            if (outputStreamWriter != null) {
                                outputStreamWriter.close();
                            }
                        }
                        catch (Throwable throwable3) {}
                        throw throwable;
                    }
                    try {
                        if (socket != null) {
                            socket.close();
                        }
                        outputStreamWriter.close();
                    }
                    catch (Throwable throwable) {}
                } while (true);
            }
            catch (Throwable throwable) {
                try {
                    if (serverSocket != null) {
                        serverSocket.close();
                        return;
                    }
                }
                catch (Throwable throwable4) {
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            }
            catch (Throwable throwable5) {}
            throw throwable;
        }
    }
}

