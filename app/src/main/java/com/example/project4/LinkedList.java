package com.example.project4;

public class LinkedList
{
    private Node head;
    private int count;
    public LinkedList()
    {
        this.head = null;
        this.count = 0;
    }

    public int length()
    {
        return this.count;
    }


    public int getAtIndex(int index)
    {
        Node currNode = this.head;
        for(int i = 0; i < index; i++)
        {
            currNode = currNode.getNextNode();
        }
        return currNode.getPayload();
    }

    public void addEnd(int payload)
    {
        Node n = new Node(payload);

        if(this.head == null)
        {
            this.head = n;
        }
        else
        {

            Node currNode = this.head;
            while(currNode.getNextNode() != null)
            {
                currNode = currNode.getNextNode();
            }


            currNode.setNextNode(n);
        }
        this.count++;
    }

    public void display()
    {
        if(this.head == null)
        {
            System.out.println("Empty List");
        }
        else
        {

        }
    }
}
