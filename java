// Check battery status using the Battery API
navigator.getBattery().then(function(battery) {
    function updateBatteryStatus() {
        let batteryLevel = battery.level * 100; // Battery percentage
        let batteryText = document.getElementById("battery-level");
        let batteryFill = document.getElementById("battery-fill");

        // Update battery level text
        batteryText.textContent = "Battery Level: " + batteryLevel.toFixed(0) + "%";

        // Update battery progress bar
        batteryFill.style.width = batteryLevel + "%";

        // Show tips if battery is low
        if (batteryLevel <= 20) {
            document.getElementById("power-saving-tips").style.display = "block";
            document.getElementById("activate-saver").style.display = "block";
        } else {
            document.getElementById("power-saving-tips").style.display = "none";
            document.getElementById("activate-saver").style.display = "none";
        }
    }

    // Update battery status on load
    updateBatteryStatus();

    // Update battery status when it changes
    battery.addEventListener('levelchange', updateBatteryStatus);

    // Activate Power Saver Mode on button click
    document.getElementById("activate-saver").addEventListener("click", function() {
        alert("Power Saver Mode activated! Reduce background processes and lower screen brightness.");
        // Example: You could add additional functionality to adjust brightness or background activities here.
    });
});
