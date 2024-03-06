package com.hi.interviews.problems;

import java.util.*;

public class DijkstraAlgorithm {

    private static final int INF = Integer.MAX_VALUE;

    public static void dijkstra(int[][] graph, int source) {
        int vertices = graph.length;
        int[] distance = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(distance, INF);
        distance[source] = 0;

        for (int i = 0; i < vertices - 1; i++) {
            int minVertex = findMinDistanceVertex(distance, visited);
            visited[minVertex] = true;

            for (int j = 0; j < vertices; j++) {
                if (!visited[j] && graph[minVertex][j] != 0 && distance[minVertex] != INF &&
                        distance[minVertex] + graph[minVertex][j] < distance[j]) {
                    distance[j] = distance[minVertex] + graph[minVertex][j];
                }
            }
        }

        printSolution(distance);
    }

    private static int findMinDistanceVertex(int[] distance, boolean[] visited) {
        int minDistance = INF;
        int minVertex = -1;

        for (int v = 0; v < distance.length; v++) {
            if (!visited[v] && distance[v] <= minDistance) {
                minDistance = distance[v];
                minVertex = v;
            }
        }

        return minVertex;
    }

    private static void printSolution(int[] distance) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < distance.length; i++) {
            System.out.println(i + " \t\t " + distance[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        dijkstra(graph, 0);
    }
}

