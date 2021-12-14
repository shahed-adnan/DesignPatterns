using System;
using System.Collections.Generic;
using System.Text;

namespace SRP
{
    /// <summary>
    /// SRP: A class or method should have only one reason to change.
    /// </summary>
    public class Device
    {
        public int DeviceId { set; get; }
        public string DeviceName { set; get; }

        public void ReadData()
        {
            //
        }

        public void ProcessData()
        {
            //
        }

        public void SendMessageToServer()
        {
            //
        }

        public void ReceiveMessageFromServer()
        {
            //
        }

        public void LogMessage()
        {
            //
        }

    }
}
