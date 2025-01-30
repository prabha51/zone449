* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    flex-direction: column;
}

.container {
    text-align: center;
    background-color: #fff;
    padding: 30px;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    width: 300px;
}

h1 {
    color: #333;
    margin-bottom: 20px;
}

.battery-status {
    margin-bottom: 20px;
}

.progress-bar {
    width: 100%;
    height: 20px;
    background-color: #e0e0e0;
    border-radius: 10px;
    overflow: hidden;
    margin-top: 10px;
}

#battery-fill {
    height: 100%;
    width: 0;
    background-color: #4caf50;
}

.tips {
    text-align: left;
    margin-top: 20px;
}

#activate-saver {
    margin-top: 20px;
    padding: 10px 20px;
    background-color: #ff5722;
    border: none;
    border-radius: 5px;
    color: white;
    cursor: pointer;
}

#activate-saver:hover {
    background-color: #e64a19;
}
