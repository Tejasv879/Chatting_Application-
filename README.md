Here is a clean `README.md` code that you can **copy-paste directly** into your project folder:

---

```markdown
# 💬 Java Console Chat Application

A simple multi-client chat system implemented using Java Sockets and multithreading.

---

## 🚀 Features

- **Server-Client Setup**: Start server once, then connect multiple clients.
- **Message Broadcasting**: Server sends a message to all connected clients.
- **Multithreaded Communication**: Each client is handled by a separate thread.
- **Input Validation**: Ensures valid integer inputs using `InputValidator`.
- **Robust Error Handling**: Uses try-catch blocks to manage runtime issues.
- **Modular Structure**: Separate classes for Server, Client, Handler, etc.
- **Clear Documentation**: Inline comments and organized layout for easy understanding.

---

## 🧠 Core Components

| Feature                      | Description                                      |
|-----------------------------|--------------------------------------------------|
| Server/Client Setup         | Establish socket communication                  |
| Message Broadcasting        | Send messages from one client to all others     |
| Thread Handling             | Each client handled independently               |
| Input Validation            | Ensures valid user input                        |
| Error Handling              | Prevents crashes with safe coding practices     |
| Modular Code                | Clean separation of logic                       |

---

## 🗂️ File Structure

```

Chat\_app2/
├── ChatServer.java         # Server: listens for clients and manages broadcast
├── ChatClient.java         # Client: connects to server, sends/receives messages
├── ClientHandler.java      # Handles each connected client (thread)
├── InputValidator.java     # Validates user input
├── Main.java               # Entry point: choose to run server or client

````

---

## ⚙️ How to Run (VS Code or Terminal)

1. **Navigate to project folder:**
   ```bash
   cd path\to\Chat_app2
````

2. **Compile all Java files:**

   ```bash
   javac *.java
   ```

3. **Run the Main program:**

   ```bash
   java Main
   ```

4. **Choose mode when prompted:**

   * Press `1` to start the server
   * Press `2` to start a client (open multiple terminals for multiple clients)

---

## 👥 Team Members
Tejasv Agarwal   24SCSE1010152
Daksh Sajwan 24SCSE1011382
Ashutosh Pandey 24SCSE1010907
Raushan Raj 24SCSE1011535
